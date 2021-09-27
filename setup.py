import setuptools

install_requires = []

extras = {
    "dev": [

    ]
}

setuptools.setup(
    name='TheSkillConsult',
    description='Recommendation system for students',
    version='0.0.1',
    packages=setuptools.find_packages(),
    install_requires=install_requires,
    extras_require=extras,
    python_requires='>=3.7',
    author='Maria Dukmak',
    author_email='Maria.dukmak@student.hu.nl',
    keyword=['recommendations', 'AI'],
    long_description=open('README.md').read(),
    long_description_content_type='text/markdown',
    include_package_data=True,
)